package �������ϵͳ;

/**
	 * ������
	 * @author ����� 1063256708@qq.com
	 * @version v1.0 Copyright(C),2019-2020
	 */
public class Flight implements FlightInterface{
	private String flightName;//������
	private int row;//��λ����
	private int rowLenth;//ÿ����λ��
	private int[] fail= {-1};//����Ԥ����
	private Passenger[] passengerList;//Ԥ����λ���ÿ�
	/**
	 * ������Ĺ��췽��
	 * @param FlightName ������
	 * @param rows ��������λ
	 * @param rowLength ÿ����λ��
	 * @throws �׳��쳣��
	 */
	public Flight(String FlightName,int rows,int rowLength)throws Exception {
		// TODO Auto-generated constructor stub
		if(FlightName==null||FlightName.trim().length()==0||rows<=0||rowLength<=0)
			throw new Exception("Error");
		else {
			this.flightName=flightName;
			this.row=rows;
			this.rowLenth=rowLength;
			this.passengerList=new Passenger[row*rowLength];//(a)����������λ
			for(int i=0;i<row*rowLenth;i++)
				passengerList[i]=null; //������λû�б�Ԥ��
		}
	}

	@Override
	public int[] reserve(String[] names) {
		// TODO Auto-generated method stub
		if(names.length>rowLenth)
			return fail;
		int i=0,j=0,k=0;
		//true--�ܰ���,false--���ܰ���
		boolean flag=false;
		//��һ����������û�б�Ԥ������λ����λ������names.length
		LabelA:for(i=0;i<=row-1;i++) {
			for(j=0;j<=rowLenth-names.length;j++) {
				//�ڱ��д�j��j+names.length-1�������Ŀ���λ
				for(k=j;k<=j+names.length-1;k++) {
					if(passengerList[i*rowLenth+k]!=null)
						break;
				}
				if(k>j+names.length-1) {//���ҵ����ӵ�i�е�j�п�ʼ
					flag=true;//�������ҵ����
					break LabelA;//�˳�����ѭ��
				}
			}
		}
		if(!flag)
			return fail;
		//�ӵ�i�е�j�п�ʼ������λ
		int[]bn=new int[names.length];//ÿһ���ÿͷ���һ��Ԥ����
		for(k=j;k<=j+names.length-1;k++) {
			bn[k-j]=i*rowLenth+k+1;//����Ԥ����,names[0]��Ӧbn[0]
			passengerList[i*rowLenth+k]=new Passenger(names[k-j], i*rowLenth+k+1, i, k);
		}
		return bn;
	}

	@Override
	public boolean cancel(int bookingNumber) {
		// TODO Auto-generated method stub
		boolean Status=false;
		for(int i=0;i<row*rowLenth;i++) {
			if(passengerList[i]!=null&&bookingNumber==passengerList[i].getBookingNumber())
			{
				Status=true;
				passengerList[i]=null;
				break;
			}
		}
		return Status;
	}

	@Override
	public Passenger[] getPassengerList() {
		// TODO Auto-generated method stub
		return passengerList;
	}
}

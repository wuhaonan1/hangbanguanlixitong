package �������ϵͳ;
/**
	 * ����ӿ�
	 * @author ����� 1063256708@qq.com
	 * @version v1.0 Copyright(C),2019-2020
	 */
public interface FlightInterface {
/**
 * Ԥ��������λ
 * @param names ����ÿ��������ַ�������
 * @return ���ش��Ԥ���ŵ�����
 */
	public int[] reserve(String[] names);//Ԥ��������λ
	/**
	 * ȡ��Ԥ����λ
	 * @param bookingNumber �ò���ָ��Ҫȡ����Ԥ����
	 * @return ���ظ���λ��Ԥ��״̬
	 */
	public boolean cancel(int bookingNumber);//ȡ��Ԥ����λ
	/**
	 * ��ȡԤ������λ���ÿ��б�
	 * @return ���ش���ÿ�����������
	 */
	public Passenger[] getPassengerList();//�����ÿ��б�
	
}

package �������ϵͳ;
/**
	 * �ÿ���
	 * @author ����� 1063256708@qq.com
	 * @version v1.0 Copyright(C),2019-2020
	 */
public class Passenger implements PassengerInterface {
	private String names;
	private int bookingNumber;
	private int rows;
	private int seatPosition;
	/**
	 * �ÿ���Ĺ��췽��
	 * @param names �ÿ�����
	 * @param bookingNumber Ԥ����
	 * @param rows ��λ����
	 * @param seatPosition ��λ��
	 */
	public Passenger(String names,int bookingNumber,int rows,int seatPosition) {
		this.names=names;
		this.bookingNumber=bookingNumber;
		this.rows=rows;
		this.seatPosition=seatPosition;
	}
	public String getName() {
		return names;
	}
	public int getBookingNumber() {
		return bookingNumber;
	}
	public int getRow() {
		return rows;
	}
	public int getSeatPosition() {
		return seatPosition;
	}
}

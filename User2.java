import java.io.Serializable;
import java.util.Date;
//�̸��� �й��� ������ �˻�
//�ߺ�üũ ���ص� ��(���ʿ� �̸��� �й� ��ġ�� �ʰ� �ۼ�)

public class User2 implements Serializable{
 
   private String address;   //�ּ�
  
   
   public User2(String name, String stuno, String major, int year, 
         Date birth, String phone, String address,
         String photo, String profile) {
      
      this.address = address;
      
   }
   //�̹����� ���� ������ ����
   //������ư ������ ���콺�� �����ǳڷ�
   //�̸��� �й��� ���� �Ұ�
   //���������� �����Ϸ�->������ ����� �����ʿ� ����
   //�����ϸ� �ٰ��� ���� 
   public void edit(String major, int year, Date birth, String phone, String address,
         String photo, String profile) { //������ ����Ʈ ������ ȣ��
     
 
   }   
  
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   
   //------------------------------------------------------------------------------
   //Student ������ ��ȯ�Ѵ�.
   //------------------------------------------------------------------------------
 
}
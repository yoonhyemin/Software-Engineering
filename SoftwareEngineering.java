import java.io.Serializable;
import java.util.Date;


public class SoftwareEngineering  implements Serializable{ 
   private String name;   
   private String major;   //����, �а�
   private int year;      //�г�
   private String phone;   //����ó

   private static int studentCount=0;          // number of Students
   
   public SoftwareEngineering(String name, String stuno, String major, int year, 
         Date birth, String phone, String address,
         String photo, String profile) {
      this.name = name;
      this.major = major;
      this.year = year;
      this.phone = phone;
      studentCount++;
   }
   //�̹����� ���� ������ ����
   //������ư ������ ���콺�� �����ǳڷ�
   //�̸��� �й��� ���� �Ұ�
   //���������� �����Ϸ�->������ ����� �����ʿ� ����
   //�����ϸ� �ٰ��� ���� 
   public void edit(String major, int year, Date birth, String phone, String address,
         String photo, String profile) { //������ ����Ʈ ������ ȣ��
      setName(name);
      setMajor(major);
      setYear(year);
      setPhone(��);
   }   

   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getMajor() {
      return major;
   }
   public void setMajor(String major) {
      this.major = major;
   }
   public int getYear() {
      return year;
   }
   public void setYear(int year) {
      this.year = year;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
  
   //------------------------------------------------------------------------------
   //Student ������ ��ȯ�Ѵ�.
   //------------------------------------------------------------------------------
   public String toString()
   {
      String description;      
      description="-�̸�: "+name+"\n";
      description+="-�а�: "+major+"\n";
      description+="-�г�: "+year+"\n";
      description+="-phonebook: "+phone+"\n";
      description+="-�Ұ�: \n";
      
      return description;
   }
}
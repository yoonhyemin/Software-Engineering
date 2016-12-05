import java.io.Serializable;
import java.util.Date;
//�̸��� �й��� ������ �˻�
//�ߺ�üũ ���ص� ��(���ʿ� �̸��� �й� ��ġ�� �ʰ� �ۼ�)

public class User3 implements Serializable{
   private String stuno;   //�й�
   private String name;   //�̸�
   private String major;   //����, �а�
   private int year;      //�г�
   private Date birth;    // �������
   private String phone;   //����ó
   private String address;   //�ּ�
   private String photo;   //���� (��� ����)   
   private String profile;   //������(�ڱ�Ұ�)
   private static int studentCount=0;          // number of Students
   
   public User3(String name, String stuno, String major, int year, 
         Date birth, String phone, String address,
         String photo, String profile) {
      this.stuno = stuno;
      this.name = name;
      this.major = major;
      this.year = year;
      this.birth = birth;
      this.phone = phone;
      this.address = address;
      this.photo = photo;
      this.profile = profile;
      studentCount++;
   }
   //�̹����� ���� ������ ����
   //������ư ������ ���콺�� �����ǳڷ�
   //�̸��� �й��� ���� �Ұ�
   //���������� �����Ϸ�->������ ����� �����ʿ� ����
   //�����ϸ� �ٰ��� ���� 
   public void edit(String major, int year, Date birth, String phone, String address,
         String photo, String profile) { //������ ����Ʈ ������ ȣ��
      setStuno(stuno);
      setName(name);
      setMajor(major);
      setYear(year);
      setBirth(birth);
      setPhone(phone);
      setAddress(address);
      setPhoto(photo);
      setProfile(profile);
   }   
   public String getStuno() {
      return stuno;
   }
   public void setStuno(String stuno) {
      this.stuno = stuno;
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
   public Date getBirth() {
      return birth;
   }
   public void setBirth(Date birth) {
      this.birth = birth;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getPhoto() {
      return photo;
   }
   public void setPhoto(String photo) {
      this.photo = photo;
   }
   public String getProfile() {
      return profile;
   }
   public void setProfile(String profile) {
      this.profile = profile;
   }
   public static int getStudentCount() {
      return studentCount;
   }   
   //------------------------------------------------------------------------------
   //Student ������ ��ȯ�Ѵ�.
   //------------------------------------------------------------------------------
   public String toString()
   {
      String description;      
      description="-�̸�: "+name+"\n";
      description+="-�й�: "+stuno+"\n";
      description+="-�а�: "+major+"\n";
      description+="-�г�: "+year+"\n";
      if(birth != null)
         description+="-�������: "+birth.getYear()+"�� "+birth.getMonth()+"�� "+birth.getDate()+"��\n";
      description+="-����ó: "+phone+"\n";
      description+="-�ּ�: "+address+"\n";
      description+="-����: "+photo+"\n";
      description+="-������: \n";
      description+=profile+"\n";      
      return description;
   }
}
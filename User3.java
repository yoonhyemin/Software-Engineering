import java.io.Serializable;
import java.util.Date;
//이름과 학번을 가지고 검색
//중복체크 안해도 됨(애초에 이름과 학번 겹치지 않게 작성)

public class User3 implements Serializable{
   private String stuno;   //학번
   private String name;   //이름
   private String major;   //전공, 학과
   private int year;      //학년
   private Date birth;    // 생년월일
   private String phone;   //연락처
   private String address;   //주소
   private String photo;   //사진 (경로 저장)   
   private String profile;   //프로필(자기소개)
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
   //이미지를 같은 폴더에 넣음
   //수정버튼 누르면 마우스가 왼쪽판넬로
   //이름과 학번은 편집 불가
   //수정누르면 수정완료->수정된 결과가 오룬쪽에 보임
   //삭제하면 다같이 삭제 
   public void edit(String major, int year, Date birth, String phone, String address,
         String photo, String profile) { //수정시 에디트 생성자 호출
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
   //Student 정보를 반환한다.
   //------------------------------------------------------------------------------
   public String toString()
   {
      String description;      
      description="-이름: "+name+"\n";
      description+="-학번: "+stuno+"\n";
      description+="-학과: "+major+"\n";
      description+="-학년: "+year+"\n";
      if(birth != null)
         description+="-생년월일: "+birth.getYear()+"년 "+birth.getMonth()+"월 "+birth.getDate()+"일\n";
      description+="-연락처: "+phone+"\n";
      description+="-주소: "+address+"\n";
      description+="-사진: "+photo+"\n";
      description+="-프로필: \n";
      description+=profile+"\n";      
      return description;
   }
}
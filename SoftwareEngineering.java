import java.io.Serializable;
import java.util.Date;


public class SoftwareEngineering  implements Serializable{ 
   private String name;   
   private String major;   //전공, 학과
   private int year;      //학년
   private String phone;   //연락처

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
   //이미지를 같은 폴더에 넣음
   //수정버튼 누르면 마우스가 왼쪽판넬로
   //이름과 학번은 편집 불가
   //수정누르면 수정완료->수정된 결과가 오룬쪽에 보임
   //삭제하면 다같이 삭제 
   public void edit(String major, int year, Date birth, String phone, String address,
         String photo, String profile) { //수정시 에디트 생성자 호출
      setName(name);
      setMajor(major);
      setYear(year);
      setPhone(콜);
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
   //Student 정보를 반환한다.
   //------------------------------------------------------------------------------
   public String toString()
   {
      String description;      
      description="-이름: "+name+"\n";
      description+="-학과: "+major+"\n";
      description+="-학년: "+year+"\n";
      description+="-phonebook: "+phone+"\n";
      description+="-소개: \n";
      
      return description;
   }
}
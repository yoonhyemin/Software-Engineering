import java.io.Serializable;
import java.util.Date;
//이름과 학번을 가지고 검색
//중복체크 안해도 됨(애초에 이름과 학번 겹치지 않게 작성)

public class User2 implements Serializable{
 
   private String address;   //주소
  
   
   public User2(String name, String stuno, String major, int year, 
         Date birth, String phone, String address,
         String photo, String profile) {
      
      this.address = address;
      
   }
   //이미지를 같은 폴더에 넣음
   //수정버튼 누르면 마우스가 왼쪽판넬로
   //이름과 학번은 편집 불가
   //수정누르면 수정완료->수정된 결과가 오룬쪽에 보임
   //삭제하면 다같이 삭제 
   public void edit(String major, int year, Date birth, String phone, String address,
         String photo, String profile) { //수정시 에디트 생성자 호출
     
 
   }   
  
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   
   //------------------------------------------------------------------------------
   //Student 정보를 반환한다.
   //------------------------------------------------------------------------------
 
}
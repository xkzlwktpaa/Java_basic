package day11;

public class User {
    private  String id;
    private  String password; //비밀번호 (private 접근 제한)

    public User(){
    }

    // 로그인 메서드
    public boolean login(String inputId, String inputPw){

        if(inputId.equals(id) && inputPw.equals(password)){
            System.out.println("로그인 성공!");
            return true;
        }
        System.out.println("로그인 실패 ㅠ");
        return false;

    }

    public  void setId(String id){
        this.id = id;
    }

    //비밀번호 8자 미만 시 가입 실패
    public void setPassword(String password){
        if(password.length() < 8){
            System.out.println("가입 실패!");
        }else{
            this.password = password;
        }
    }

    public  String getId(){
        return id;
    }

    public String getPassword(){
            return password;
        }
    }

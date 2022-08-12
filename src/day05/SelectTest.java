package day05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

    public static void main(String[] args) {
        //1. 선언!!  -- 접속(Connection), 쿼리작성(PreparedStatement),결과(ResultSet)
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //3. 접속
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/skudb";
            String user = "sku";
            String password = "0000";


            conn = DriverManager.getConnection(url, user, password);


            //4. 쿼리작성
            String sql = "select id,name,password,email from member";
            ps = conn.prepareStatement(sql);


            //5. 쿼리실행
            rs = ps.executeQuery();


            //6. 결과값 얻어오기!!
            while (rs.next()) {                                         //next의 결과가 true를 리턴할때 까지 실행
                System.out.print(rs.getString(1)+"\t");         //숫자는 컬럼 순서
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getString(3)+"\t");
                System.out.println(rs.getString(4));
            }


        }catch (Exception e) {

        }finally {

            //2. 선언한 자원들을 닫아준다!!!
            if(rs != null) {
                try {
                    rs.close();                         //핵심코드
                } catch (SQLException e) {              //null이면 실행x
                    e.printStackTrace();
                }
            }
            //ps와 conn도 동일하게 해준다
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;







public class saveduo {
	public static Connection   getconnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pankaj","root","root");
		 
		 
		 
		}catch(Exception ee)
		{
			
			ee.printStackTrace();
			
		}
	return con;
		
	}
	
	
	public static int save(setgetduo d)
	{
		int status=0;
		Connection con=saveduo.getconnection();
		
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into  preregistration1(name,lname,mobile,amobile)values(?,?,?,?)");
			ps.setString(1, d.getName());
			ps.setString(2, d.getLname());
			ps.setString(3, d.getMobile());
			ps.setString(4, d.getAmobile());
			status=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		return status;
		
	}
	
	public static int ambulance(setgetduo d)
	{
		int status=0;
		Connection con=saveduo.getconnection();
		
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into  ambulance(fname,lname,mobile,paddress,gender,requester)values(?,?,?,?,?,?)");
			ps.setString(1, d.getFname());
			ps.setString(2, d.getLname());
			ps.setString(3, d.getMobile());
			ps.setString(4, d.getPadd());
			ps.setString(5, d.getGender());
			ps.setString(6, d.getRequester());
			status=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		return status;
		
	}
	public static int covid(setgetduo d)
	{
		int status=0;
		Connection con=saveduo.getconnection();
		
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into covid1(fname,lname,email,addr,mobile)values(?,?,?,?,?)");
			ps.setString(1, d.getFname());
			ps.setString(2, d.getLname());
			ps.setString(3, d.getEmail());
			ps.setString(4, d.getAdd());
			ps.setString(5, d.getMobile());
			
			status=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		return status;
		
	}
	
	public static int otherpatient(setgetduo d)
	{
		int status=0;
		Connection con=saveduo.getconnection();
		
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into otherpatient(fname,lname,email,addr,mobile)values(?,?,?,?,?)");
			ps.setString(1, d.getFname());
			ps.setString(2, d.getLname());
			ps.setString(3, d.getEmail());
			ps.setString(4, d.getAdd());
			ps.setString(5, d.getMobile());
			
			status=ps.executeUpdate();
			con.close();
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		return status;
		
	}
	
	public static List<setgetduo> view(){
		List<setgetduo> list=new ArrayList<setgetduo>();
		try{
			Connection con=saveduo.getconnection();
			PreparedStatement ps=con.prepareStatement("select * from  covid1");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			setgetduo bean=new setgetduo();
				bean.setId(rs.getString("id"));
				bean.setFname(rs.getString("fname"));
				bean.setLname(rs.getString("lname"));
				bean.setEmail(rs.getString("email"));
				bean.setAdd(rs.getString("addr"));
				bean.setMobile(rs.getString("mobile"));
				list.add(bean);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	public static List<setgetduo> viewambu(){
		List<setgetduo> list=new ArrayList<setgetduo>();
		try{
			Connection con=saveduo.getconnection();
			PreparedStatement ps=con.prepareStatement("select * from  ambulance");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			setgetduo b=new setgetduo();
				b.setId(rs.getString("id"));
				b.setFname(rs.getString("fname"));
				b.setLname(rs.getString("lname"));
				b.setMobile(rs.getString("mobile"));
				b.setAdd(rs.getString("paddress"));
				b.setGender(rs.getString("gender"));
				b.setRequester(rs.getString("requester"));
				list.add(b);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	
	public static int delete(int id){
		int status=0;
		try{
			Connection con=saveduo.getconnection();
			PreparedStatement ps=con.prepareStatement("delete from covid1 where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}

	public static int deleteambu(int id){
		int status=0;
		try{
			Connection con=saveduo.getconnection();
			PreparedStatement ps=con.prepareStatement("delete from ambulance where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}

}

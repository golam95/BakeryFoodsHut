package com.bakeryfoodshut.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bakeryfoodshut.dao.PostDao;
import com.bakeryfoodshut.model.ManageprofileInfo;
import com.bakeryfoodshut.model.Post;
import com.bakeryfoodshut.utils.DBconnection;

public class PostDaoImpl implements PostDao {

	private int total_records;

	@Override
	public void addPost(Post post) {
		Connection con = DBconnection.getConnecttion();
		String sql = "Insert into post "
				+ "(shopkeeperemail,productname,quantity,weight,discount,productdes,age,date,img,district,area,price,productcategory,pricetype) "
				+ "values (?, ?, ?, ?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, post.getShopkeeperEmail());
			ps.setString(2, post.getProductName());
			ps.setInt(3, post.getPostQuantity());
			ps.setString(4, post.getPostWeight());
			ps.setString(5, post.getPostDiscount());
			ps.setString(6, post.getPostProductdes());
			ps.setString(7, post.getPostAge());
			ps.setString(8, post.getPostDate());
			ps.setString(9, post.getImg());
			ps.setString(10, post.getPostDistrict());
			ps.setString(11, post.getPostArea());
			ps.setString(12, post.getPrice());
			ps.setString(13, post.getCategorytype());
			ps.setString(14, post.getPricetype());
			ps.executeUpdate();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public List<Post> getPostinfoList(String username) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from post where shopkeeperemail='" + username + "'";
		List<Post> list = new ArrayList<Post>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String useremail = rs.getString("shopkeeperemail");
				String productname = rs.getString("productname");
				String quantity = rs.getString("quantity");
				String weight = rs.getString("weight");
				String discount = rs.getString("discount");
				String productdescription = rs.getString("productdes");
				String age = rs.getString("age");
				String date = rs.getString("date");
				String img = rs.getString("img");
				String district = rs.getString("district");
				String area = rs.getString("area");
				String price = rs.getString("price");
				String category = rs.getString("productcategory");
				String pricetype = rs.getString("pricetype");
				list.add(new Post(id, useremail, productname, Integer.parseInt(quantity), weight, discount,
						productdescription, age, date, img, district, area, price, category, pricetype));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Post getPostInfo(String email) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from post where id ='" + email + "'";
		Post list = new Post();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String useremail = rs.getString("shopkeeperemail");
				String productname = rs.getString("productname");
				String quantity = rs.getString("quantity");
				String weight = rs.getString("weight");
				String discount = rs.getString("discount");
				String productdescription = rs.getString("productdes");
				String age = rs.getString("age");
				String date = rs.getString("date");
				String img = rs.getString("img");
				String district = rs.getString("district");
				String area = rs.getString("area");
				String price = rs.getString("price");
				String category = rs.getString("productcategory");
				String pricetype = rs.getString("pricetype");
				list = new Post(id, useremail, productname, Integer.parseInt(quantity), weight, discount,
						productdescription, age, date, img, district, area, price, category, pricetype);

			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updatePostInfo(Post postinfo) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update post set productname=?, quantity=?, weight=?,discount=?,productdes=?,age=?,date=?,district=?,area=?,price=? where  id=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, postinfo.getProductName());
			ps.setInt(2, postinfo.getPostQuantity());
			ps.setString(3, postinfo.getPostWeight());
			ps.setString(4, postinfo.getPostDiscount());
			ps.setString(5, postinfo.getPostProductdes());
			ps.setString(6, postinfo.getPostAge());
			ps.setString(7, postinfo.getPostDate());
			ps.setString(8, postinfo.getPostDistrict());
			ps.setString(9, postinfo.getPostArea());
			ps.setString(10, postinfo.getPrice());
			ps.setInt(11, postinfo.getPostId());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletePost(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "delete from post where id='" + id + "'";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Post> getpostList(int page1, int page2) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select SQL_CALC_FOUND_ROWS * from post limit " + page1 + ", " + page2;
		List<Post> list = new ArrayList<Post>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String useremail = rs.getString("shopkeeperemail");
				String productname = rs.getString("productname");
				String quantity = rs.getString("quantity");
				String weight = rs.getString("weight");
				String discount = rs.getString("discount");
				String productdescription = rs.getString("productdes");
				String age = rs.getString("age");
				String date = rs.getString("date");
				String image = rs.getString("img");
				String district = rs.getString("district");
				String area = rs.getString("area");
				String price = rs.getString("price");
				String category = rs.getString("productcategory");
				String pricetype = rs.getString("pricetype");
				list.add(new Post(id, useremail, productname, Integer.parseInt(quantity), weight, discount,
						productdescription, age, date, image, district, area, price, category, pricetype));
			}
			rs = ps.executeQuery("SELECT COUNT(id)FROM post");
			if (rs.next()) {
				this.total_records = rs.getInt("COUNT(id)");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int get_totalrecords() {
		return total_records;
	}

	@Override
	public List<Post> searchListPost(String value) {
		Connection con = DBconnection.getConnecttion();
		String sql = null;
		sql = "SELECT *FROM `post` WHERE CONCAT (`id`,`shopkeeperemail`,`productname`,`quantity`,`weight`,`discount`,`productdes`,`age`,`date`,`district`,`area`,`price`,`productcategory`,`pricetype`) LIKE '%"
				+ value + "%'";
		List<Post> list = new ArrayList<Post>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String useremail = rs.getString("shopkeeperemail");
				String productname = rs.getString("productname");
				String quantity = rs.getString("quantity");
				String weight = rs.getString("weight");
				String discount = rs.getString("discount");
				String productdescription = rs.getString("productdes");
				String age = rs.getString("age");
				String date = rs.getString("date");
				String img = rs.getString("img");
				String district = rs.getString("district");
				String area = rs.getString("area");
				String price = rs.getString("price");
				String category = rs.getString("productcategory");
				String pricetype = rs.getString("pricetype");
				list.add(new Post(id, useremail, productname, Integer.parseInt(quantity), weight, discount,
						productdescription, age, date, img, district, area, price, category, pricetype));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean check_Discount(String discount) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from post where discount='" + discount + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean check_Price(String price) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from post where price='" + price + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public Post getpostListId(int postid) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from post where id='" + postid + "'";
		Post list = new Post();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String useremail = rs.getString("shopkeeperemail");
				String productname = rs.getString("productname");
				String quantity = rs.getString("quantity");
				String weight = rs.getString("weight");
				String discount = rs.getString("discount");
				String productdescription = rs.getString("productdes");
				String age = rs.getString("age");
				String date = rs.getString("date");
				String image = rs.getString("img");
				String district = rs.getString("district");
				String area = rs.getString("area");
				String price = rs.getString("price");
				String category = rs.getString("productcategory");
				String pricetype = rs.getString("pricetype");
				list = new Post(id, useremail, productname, Integer.parseInt(quantity), weight, discount,
						productdescription, age, date, image, district, area, price, category, pricetype);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean checkpost_id(int id) {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from post where id='" + id + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override

	public void updatePostCart(Post postupdate) {
		Connection con = DBconnection.getConnecttion();
		String sql = "update post set quantity=? where  shopkeeperemail=?";
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setInt(1, postupdate.getPostQuantity());
			ps.setString(2, postupdate.getShopkeeperEmail());
			ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Post> getAdminpostList() {
		Connection con = DBconnection.getConnecttion();
		String sql = "select * from post";
		List<Post> list = new ArrayList<Post>();
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String useremail = rs.getString("shopkeeperemail");
				String productname = rs.getString("productname");
				String quantity = rs.getString("quantity");
				String weight = rs.getString("weight");
				String discount = rs.getString("discount");
				String productdescription = rs.getString("productdes");
				String age = rs.getString("age");
				String date = rs.getString("date");
				String img = rs.getString("img");
				String district = rs.getString("district");
				String area = rs.getString("area");
				String price = rs.getString("price");
				String category = rs.getString("productcategory");
				String pricetype = rs.getString("pricetype");
				list.add(new Post(id, useremail, productname, Integer.parseInt(quantity), weight, discount,
						productdescription, age, date, img, district, area, price, category, pricetype));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}

package com.bakeryfoodshut.dao;

import java.util.List;
import com.bakeryfoodshut.model.Post;

public interface PostDao {

	public void addPost(Post post);

	public List<Post> getPostinfoList(String username);
	
	public Post getPostInfo(String email);

	public void updatePostInfo(Post postinfo);
	
	public void updatePostCart(Post postupdate);

	public void deletePost(int id);
	
	public List<Post> getpostList(int page1, int page2);
	
	public List<Post> getAdminpostList();
	
	public int get_totalrecords();
	
	public List<Post> searchListPost(String value);
	
	public Post getpostListId(int postid);
	
	
	
	public boolean check_Discount(String discount);

	public boolean check_Price(String price);
	
	public boolean checkpost_id(int id);
	
	

}

package com.bakeryfoodshut.serviceImpl;

import java.util.List;
import com.bakeryfoodshut.dao.PostDao;
import com.bakeryfoodshut.daoImpl.PostDaoImpl;
import com.bakeryfoodshut.model.Post;
import com.bakeryfoodshut.service.PostService;

public class PostServiceImpl implements PostService {

	PostDao postdao = new PostDaoImpl();

	@Override
	public void addPost(Post post) {
		postdao.addPost(post);
	}

	@Override
	public Post getPostInfo(String email) {
		return postdao.getPostInfo(email);
	}

	@Override
	public void updatePostInfo(Post postinfo) {
		postdao.updatePostInfo(postinfo);
	}

	@Override
	public void deletePost(int id) {
		postdao.deletePost(id);
	}

	@Override
	public List<Post> getPostinfoList(String username) {
		return postdao.getPostinfoList(username);
	}

	@Override
	public List<Post> getpostList(int page1, int page2) {
		return postdao.getpostList(page1, page2);
	}

	@Override
	public int get_totalrecords() {
		return postdao.get_totalrecords();
	}

	@Override
	public List<Post> searchListPost(String value) {
		return postdao.searchListPost(value);
	}

	@Override
	public boolean check_Discount(String discount) {
		return postdao.check_Discount(discount);
	}

	@Override
	public boolean check_Price(String price) {
		return postdao.check_Price(price);
	}

	@Override
	public Post getpostListId(int postid) {
		return postdao.getpostListId(postid);
	}

	@Override
	public boolean checkpost_id(int id) {
		return postdao.checkpost_id(id);
	}

	@Override
	public void updatePostCart(Post postupdate) {
		postdao.updatePostCart(postupdate);
	}

	@Override
	public List<Post> getAdminpostList() {
		return postdao.getAdminpostList();
	}

}

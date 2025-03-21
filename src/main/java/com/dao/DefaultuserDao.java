package com.dao;

import com.entity.DefaultuserEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DefaultuserVO;
import com.entity.view.DefaultuserView;


/**
 * 注册用户
 * 
 * @author 
 * @email 
 * @date 2021-03-10 14:28:33
 */
public interface DefaultuserDao extends BaseMapper<DefaultuserEntity> {
	
	List<DefaultuserVO> selectListVO(@Param("ew") Wrapper<DefaultuserEntity> wrapper);
	
	DefaultuserVO selectVO(@Param("ew") Wrapper<DefaultuserEntity> wrapper);
	
	List<DefaultuserView> selectListView(@Param("ew") Wrapper<DefaultuserEntity> wrapper);

	List<DefaultuserView> selectListView(Pagination page,@Param("ew") Wrapper<DefaultuserEntity> wrapper);
	
	DefaultuserView selectView(@Param("ew") Wrapper<DefaultuserEntity> wrapper);
	
}

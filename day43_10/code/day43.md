分页功能

```
1.sql语句咋写
	
	select * from employee limit 0,5;   第一页  展示5条数据
	select * from employee limit 5,5;   第二页  展示5条数据
	select * from employee limit 10,5;  第三页  展示5条数据
	
	select * from emplopyee limit ?, ?;
	想办法对两个?进行赋值
		第二个?能确定:  就是数值（5）
		第一个?咋确定：  (第几页 - 1) * 每页显示的数据（5）
				第几页咋办？ 通过url传过来 拼接
				http://localhost:8080/day41_empmanager/IndexServlet?pageNo=1
				http://localhost:8080/day41_empmanager/IndexServlet?pageNo=2
				http://localhost:8080/day41_empmanager/IndexServlet?pageNo=3
			但是不可能手动拼接，使用前端来进行拼接	
				
				
				
				
	尾页和下一页是由bug的
	17条数据  每页显示6   17/ 6 + 1       总共3页
	12条数据  每页显示6   12 /6           总共3页
	公式:
		整除:总条数/每页显示的数据 
    	有余数: 总条数/每页显示的数据  + 1
    	总条数 咋弄？   select count(*) from employee
```


import java.util.List;

import com.gao.entity.Teacher;

public class TeacherTest {
	
	public static void main(String[] args) {
		String path = "要解析的文件路径";
		List<Teacher> list = parseFileToList(path); // 看步骤4
		boolean flag = insertTeachers(list);  //看步骤5
		
		if(flag){
			System.out.println("插入成功");
		}else{
			System.out.println("插入失败");
		}

	}

	//将list里面数据插入到数据表中
	private static boolean insertTeachers(List<Teacher> list) {
		
		// TODO Auto-generated method stub
		return false;
		
	}

	//读取文件，将文件内容封装成list返回
	private static List<Teacher> parseFileToList(String path) {
		
		// TODO Auto-generated method stub
		return null;
		
	}

}


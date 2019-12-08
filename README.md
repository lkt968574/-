### 李阔天
### 计G191
### 2019322166
## 实验目的
* 分析学生选课系统
* 使用GUI窗体及其组件设计窗体界面
* 完成学生选课过程业务逻辑编辑
* 基于文件保存并读取数据
* 处理异常

## 代码：
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TestFlowLayout {

    public static void main(String[] args) {

    	 Frame f = new Frame();//建立一个空窗口。
    	 f.setTitle("Frame WHERECOME du");
    	 FlowLayout fl = new FlowLayout();  //使用流布局
         f.setLayout(fl);//修改布局管理
         f.setSize(500, 400);//设置窗口大小,
         f.setLocation(300, 200);//设置窗口的初始位置
         f.setVisible(true);//显示窗口。
    	 

         f.addWindowListener(new WindowAdapter(){
 			public void windowClosing(WindowEvent e){
 				Window window=(Window)e.getComponent();
 				window.dispose();
 			}
 		});


 		TextField textField = new TextField();
 		textField.setBounds(200, 100, 200, 50);
 		textField.setBackground(Color.white);
 		MyActionListener myActionListener = new MyActionListener(textField);//创建一个按钮监听事件对象
 		f.add(textField);
 		Button button1= new Button("Choose couse");
 		Button button2= new Button("Back course");
 		button1.setBounds(100,100,100,100);
 		button1.setBackground(Color.orange);
 		button1.addActionListener(myActionListener);//添加myActionListener监听事件
 		f.add(button1);

 		button2.setBounds(300,300,300,300);
 		button2.setBackground(Color.red);
 		ActionListener myActionListener2=new MyActionListener2(textField);
		button2.addActionListener(myActionListener2);//添加myActionListener监听事件
 		f.add(button2);
        f.setLayout(null);//清空布局
    }
    	
}
class MyActionListener implements ActionListener{
	
	 Course course=new Course(1, "Java", "综合楼",3,3);
	 Teather teather=new Teather(1, "张世博", "男",course);
	 Student student=new Student(1, "王智民", "男",course,teather);
	private TextField textField;
 
	public MyActionListener(TextField textField) {
		super();
		this.textField = textField;
	}
	public void actionPerformed(ActionEvent e) {
		textField.setText(" " +student+ " ");
}
}
class MyActionListener2 implements ActionListener{
	
	private TextField textField;
	public MyActionListener2(TextField textField) {
		super();
		this.textField = textField;
	}
	public void actionPerformed(ActionEvent e) {
			textField.setText("not to chouse course");
	
	}
	
}






## 实验效果
![image](https://github.com/lkt968574/-/blob/master/123.png)

## 实验心得
通过这次字符串实验，我对本学期的Java知识总结性的学习了一下，

从新建Java程序到编程，使用GUI的相关组件完成了界面的实现。

本次实验内容是总结性的，固然难度较高，编写代码的途中遇到了

很多困难，但在课外材料以及同血的帮助下，最终还是让程序得以

实现今后我会更加注重实践，勤学多练，用积累来提高自己。

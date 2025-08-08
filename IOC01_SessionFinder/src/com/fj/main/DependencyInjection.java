package com.fj.main;
import org.springframework.context.support.*;
import com.fj.sbeans.SessionFinder;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;
public class DependencyInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/fj/cfgs/applicationContext.xml");
		
		Object obj=ctx.getBean("sf");
		
		SessionFinder x=(SessionFinder)obj;
		
		String result=x.sFinder("Farooq",8);
		System.out.println(result);
		System.Out.println("GIT IS WORKINK");
		ctx.close();
	}

}

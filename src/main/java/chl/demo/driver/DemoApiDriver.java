package chl.demo.driver;

import chl.demo.api.DemoApplication;
import zx.soft.utils.driver.ProgramDriver;

public class DemoApiDriver {
	
	/**
	 * 主函数
	 */
	public static void main(String[] args) {
		int exitCode = -1;
		ProgramDriver pgd = new ProgramDriver();
		try {
			pgd.addClass("demoApplication", DemoApplication.class, "app-demo CURD接口服务");
			pgd.driver(args);
			// Success
			exitCode = 0;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}

		System.exit(exitCode);
	}


}

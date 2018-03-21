package com.single;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader {
	
	@Override
	public Class<?> findClass(String name) {
		String fileName = "C:\\Users\\yanga\\Desktop\\" +
							name.substring(name.lastIndexOf(".") + 1) + ".class";
		InputStream in = null;
		ByteArrayOutputStream bu = null;
		try {
			in = new FileInputStream(new File(fileName));
			bu = new ByteArrayOutputStream();
			int len = 0;
			byte[] buffer = new byte[1024];
			while((len = in.read(buffer, 0, buffer.length)) > 0) {
				bu.write(buffer, 0, len);
			}
			byte[] result = bu.toByteArray();
			return defineClass(name,result,0,result.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				bu.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
    }
}

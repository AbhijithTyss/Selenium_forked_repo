package com.tyss.ec.genericutility;

import java.time.LocalDateTime;

public class JavaUtility {
  
	public String getSystemDateTime()
	{
		return LocalDateTime.now().toString();
	}
}

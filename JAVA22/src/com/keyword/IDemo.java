package com.keyword;
/*
 * Class --> Class || use "extends" word
 * Interface --> Interface || Use "extends" word
 * Class --> Interface || Use "implements" word
 */
interface IDemo2{
	int i2 = 450;
}

public interface IDemo extends IDemo2{
	int i_no = 120;
	public void show();
}

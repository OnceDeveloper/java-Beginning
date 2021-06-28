class 户{
	String 居部 = "葡";
	int 啊拜 = 300;
	
	户(){}
	户(String 居部){
		this.居部 = 居部;
	}
	户(int 啊拜){
		this.啊拜 = 啊拜;
	}
	户(String 居部, int 啊拜){
		this.居部 = 居部;
		this.啊拜 = 啊拜;
	}
}
class 酒林赣聪{
	int age = 50;
	户 户1, 户2, 户3, 户4;
	void 绷绰促(){
	户1 = new 户();
	户2 = new 户("汲帕");
	户3 = new 户(500);
	户4 = new 户("绊备付",1000);

	System.out.println("居部啊 "+户1.居部+"捞绊, 啊拜捞 "+户1.啊拜+"牢 贺绢户捞 备况脸促");
	System.out.println("居部啊 "+户2.居部+"捞绊, 啊拜捞 "+户2.啊拜+"牢 贺绢户捞 备况脸促");
	System.out.println("居部啊 "+户3.居部+"捞绊, 啊拜捞 "+户3.啊拜+"牢 贺绢户捞 备况脸促");
	System.out.println("居部啊 "+户4.居部+"捞绊, 啊拜捞 "+户4.啊拜+"牢 贺绢户捞 备况脸促");
	}
	void 魄概茄促(户 蛔){
		System.out.println("酒捞俊霸 啊拜捞 "+ 蛔.啊拜+"牢 贺绢户阑 魄概茄促.");
	}
}
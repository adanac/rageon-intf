package com.adanac.tool.rageon.constant;

public class RageonConstant {

	public static final int NUM_0 = 0;
	public static final int NUM_1 = 1;
	public static final int NUM_2 = 2;
	public static final int NUM_3 = 3;
	public static final int NUM_4 = 4;

	public static final String FAIL = "0";
	public static final String SUCCESS = "1";
	public static final String ERROR = "2";

	public enum State {
		FAIL("FAIL", 0), SUCCESS("SUCCESS", 1), ERROR("ERROR", 2);
		private String name;
		private int index;

		// 构造方法不能为public，因为enum并不可以被实例化
		private State(String name, int index) {
			this.name = name;
			this.index = index;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

	}

	public enum OperState {
		Normal("正常态", 1), Update("已更新", 2), Deleted("已删除", 3), Fired("已屏蔽", 4);
		private String name;
		private int index;

		// 构造方法不能为public，因为enum并不可以被实例化
		private OperState(String name, int index) {
			this.name = name;
			this.index = index;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

	}
}

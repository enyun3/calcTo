package agh.to.model;

public enum Basic implements Operation {
	ADD {
		@Override
		public int calc(int input1, int input2) {
			return input1 + input2;
		}
	},
	SUBTRACT {
		@Override
		public int calc(int input1, int input2) {
			return input1 - input2;
		}
	},
	MULTIPLY {
		@Override
		public int calc(int input1, int input2) {
			return input1 * input2;
		}
	},
	DIVIDE {
		@Override
		public int calc(int input1, int input2) {
			return input1 / input2;
		}
	};


	public static void ADD(int num1, int num2) {
	}

	@Override
	public String toString() {
		return switch (this) {
			case ADD -> " + ";
			case SUBTRACT -> " - ";
			case MULTIPLY -> " * ";
			case DIVIDE -> " / ";
		};
	}
}



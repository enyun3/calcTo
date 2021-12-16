package agh.to.model;

public enum Scientific implements Operation {
	POWER {
		@Override
		public int calc(int input1, int input2) {
			int result = input1;

			if (input2 == 0) return 1;

			for (int i = 1; i < input2; i++) {
				result *= input1;
			}
			return result;
		}
	},
	SINUS {
		@Override
		public int calc(int input1, int input2){
			// TODO: implement this one
			return 0;
		}
	},
	FIBB {
		@Override
		public int calc(int input1, int input2){
			// TODO: implement this one
			return 0;
		}
	}
}

package agh.to.model;

public enum Scientific implements Operation {
	POWER {
		@Override
		public int calc(int... input) {
			int result = input[0];

			if (input[1] == 0) return 1;

			for (int i = 1; i < input[1]; i++) {
				result *= input[0];
			}
			return result;
		}
	},
	SINUS {
		@Override
		public int calc(int... input) {
			return 0;
		}
	},
	FIBB {
		@Override
		public int calc(int... input) {
			return 0;
		}
	}
}

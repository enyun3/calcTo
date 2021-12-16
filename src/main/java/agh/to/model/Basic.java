package agh.to.model;

import java.util.Arrays;
import java.util.stream.IntStream;

public enum Basic implements Operation {
	ADD {
		@Override
		public int calc(int... input) {
			return IntStream.of(input).sum();
		}
	},
	SUBTRACT {
		@Override
		public int calc(int... input) {
			return input[0] - input[1];
		}
	},
	MULTIPLY {
		@Override
		public int calc(int... input) {
			return Arrays.stream(input).reduce(1, (a, b) -> a * b);
		}
	},
	DIVIDE {
		@Override
		public int calc(int... input) {
			return input[0] / input[1];
		}
	};

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



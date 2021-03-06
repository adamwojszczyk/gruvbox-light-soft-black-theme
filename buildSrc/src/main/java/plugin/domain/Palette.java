package plugin.domain;

import plugin.domain.color.Color;

import java.util.Objects;

public interface Palette {
	Color red();
	Color orange();
	Color yellow();
	Color green();
	Color aqua();
	Color blue();
	Color purple();
	Color silver();

	Color black();
	Color gray();
	Color sepia();

	class Hex implements Palette {

		private final Palette palette;

		public Hex(Palette palette) { this.palette = Objects.requireNonNull(palette); }

		@Override
		public Color red() {
			return palette.red().hex();
		}

		@Override
		public Color orange() {
			return palette.orange().hex();
		}

		@Override
		public Color yellow() {
			return palette.yellow().hex();
		}

		@Override
		public Color green() {
			return palette.green().hex();
		}

		@Override
		public Color aqua() {
			return palette.aqua().hex();
		}

		@Override
		public Color blue() {
			return palette.blue().hex();
		}

		@Override
		public Color purple() {
			return palette.purple().hex();
		}

		@Override
		public Color silver() {
			return palette.silver().hex();
		}

		@Override
		public Color black() {
			return palette.black().hex();
		}

		@Override
		public Color gray() {
			return palette.gray().hex();
		}

		@Override
		public Color sepia() {
			return palette.sepia().hex();
		}
	}

	class Plain implements Palette {

		private final Palette palette;

		public Plain(Palette palette) { this.palette = palette; }

		@Override
		public Color red() {
			return palette.red().plain();
		}

		@Override
		public Color orange() {
			return palette.orange().plain();
		}

		@Override
		public Color yellow() {
			return palette.yellow().plain();
		}

		@Override
		public Color green() {
			return palette.green().plain();
		}

		@Override
		public Color aqua() {
			return palette.aqua().plain();
		}

		@Override
		public Color blue() {
			return palette.blue().plain();
		}

		@Override
		public Color purple() {
			return palette.purple().plain();
		}

		@Override
		public Color silver() {
			return palette.silver().plain();
		}

		@Override
		public Color sepia() {
			return palette.sepia().plain();
		}

		@Override
		public Color gray() {
			return palette.gray().plain();
		}

		@Override
		public Color black() {
			return palette.black().plain();
		}
	}
}

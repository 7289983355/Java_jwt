package day_8;

import java.util.Objects;

// Number of medals.
public class NumberOfMedals {

	// Number of gold medals
	private int goldCount;

	// Number of silver medals
	private int silverCount;

	// Number of bronze medals
	private int bronzeCount;

	public NumberOfMedals(int goldCount, int silverCount, int bronzeCount) {
		this.goldCount = goldCount;
		this.silverCount = silverCount;
		this.bronzeCount = bronzeCount;
	}

	public int getGoldCount() {
		return goldCount;
	}

	public int getSilverCount() {
		return silverCount;
	}

	public int getBronzeCount() {
		return bronzeCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bronzeCount, goldCount, silverCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberOfMedals other = (NumberOfMedals) obj;
		return bronzeCount == other.bronzeCount && goldCount == other.goldCount && silverCount == other.silverCount;
	}
}

package gameplay.house;

public enum Tier {
	Nul(25,4,4,4,4),
	Standard(100,6,6,5,6),
	Bois(125,-10,20,5,20),
	Pierre(250,60,60,30,40),
	Acier(1250,70,30,70,20),
	Futuriste(2500,80,110,70,70);
	
	private int PV;
	private int fireResistance;
	private int lightningResistance;
	private int groundResistance;
	private int acideResistance;
	
	Tier(int PV, int fRes, int lRes, int gRes, int aRes) {
		this.PV = PV;
		fireResistance = fRes;
		lightningResistance = lRes;
		groundResistance = gRes;
		acideResistance = aRes;
	}

	public int getFireResistance() {
		return fireResistance;
	}

	public int getLightningResistance() {
		return lightningResistance;
	}

	public int getGroundResistance() {
		return groundResistance;
	}

	public int getAcideResistance() {
		return acideResistance;
	}

	public int getPV() {
		return PV;
	}

}

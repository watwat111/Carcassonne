

class Player {
	private static int DEFAULT_MEAPLE = 8;
	private int meaple; //実態はMeapleobjectを持たせる
	private int score;


	public Player() {
		meaple = DEFAULT_MEAPLE;
		score = 0;
	}

	/**
	 * TODO:Gameクラスによって変更
	 */
	public void putMeaple(){
		this.meaple--;

	}

	/**
	 * TODO:Gameクラスによって変更
	 */
	public void returnMeaple(){
		this.meaple++;
	}


	public int getScore(){return score;}
	public int getMeaple(){return meaple;}
}

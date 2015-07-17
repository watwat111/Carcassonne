package carcassonne;


class Player {
	private static int DEFAULT_MEAPLE = 8;
	private int meaple; //���Ԃ�Meapleobject����������
	private int score;


	public Player() {
		meaple = DEFAULT_MEAPLE;
		score = 0;
	}

	/**
	 * TODO:Game�N���X�ɂ���ĕύX
	 */
	public void putMeaple(){
		this.meaple--;

	}

	/**
	 * TODO:Game�N���X�ɂ���ĕύX
	 */
	public void returnMeaple(){
		this.meaple++;
	}


	public int getScore(){return score;}
	public int getMeaple(){return meaple;}
}

 package asdf;

public class Ex09_25 {

	public static void main(String[] args) {
		short [] lotto = {0,0,0,0,0,0};
		char dupl = 'N';
		
		for(int i = 0;i < lotto.length;) {
			lotto [i] = getNumber();
			
			for(int j = 0; j < lotto.length; j++) {
				if(lotto [i] == lotto[j])
					dupl = 'Y';
			}
				if(dupl == 'N')
					i++;
				else
					dupl = 'N';
					
			
		}
		System.out.print("추첨된 로또 번호 ==> ");
		for(int i = 0 ; i <lotto.length; i++) {
			System.out.printf("%d  ",lotto[i]);
		}
	}

	private static short getNumber() {
		return (short)(Math.random()*45+1);
	}

}

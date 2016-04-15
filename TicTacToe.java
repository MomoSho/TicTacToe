import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TicTacToe implements ActionListener {

	JFrame window = new JFrame("TicTacToe Game");
	JButton btns[] = new JButton[9];
	
	int count = 0;
	String turn = "X";
	boolean winner = false;
	
	TicTacToe() {
		window.setSize(300, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLayout(new GridLayout(3, 3));
		
		for(int i = 0; i < 9; i++) {
			btns[i] = new JButton("");
			window.add(btns[i]);
			
			/* Add the ActionListener to each Button */
			btns[i].addActionListener(this);
		}
	}
	
	
	
	public static void main(String[] args) {
		new TicTacToe();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		
		if(turn.equals("X")) {
			JButton tmp = (JButton) e.getSource();
			tmp.setText("X");
			
			turn = "O";
			tmp.setEnabled(false);
		}
		else {
			JButton tmp = (JButton) e.getSource();
			tmp.setText("O");
			
			turn = "X";
			tmp.setEnabled(false);
		}
		
		/*if(tmp2.getText() != "") {
			if(btns[0].getText() == btns[1].getText()
					&& btns[1].getText() == btns[2].getText()
					&& btns[0].getText() != "") {
				System.out.println("WINNER");
			}
			else if(btns[3].getText().equals( btns[4].getText()) && btns[3].getText().equals( btns[5].getText())) {
				System.out.println("WINNER");
			}
			else if(btns[6].getText().equals( btns[7].getText()) && btns[6].getText().equals( btns[8].getText())) {
				System.out.println("WINNER");
			}
		}*/
		
		if(btns[0].getText() == btns[1].getText()
				&& btns[1].getText() == btns[2].getText()
				&& btns[0].getText() != ""){
			System.out.println("WINNER");
		}
		else if(btns[3].getText() == btns[4].getText()
				&& btns[4].getText() == btns[5].getText()
				&& btns[3].getText() != ""){
			//win = true;
		}
		else if(btns[6].getText() == btns[7].getText()
				&& btns[7].getText() == btns[8].getText()
				&& btns[6].getText() != ""){
			//win = true;
		}
	}

}

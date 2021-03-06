import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Leds {
	static JFrame frame;
	static JTextField fieldLedPrg;
	static JTextField fieldLedMod;
	static JButton plusMod, minusMod, plusPrg, minusPrg;
	static File destination, sorse;
	static File[] destinationArr, sorseArr;

	public static void main(String[] args) {

		frame = new JFrame("SET LED");
		frame.setLayout(null);
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		fieldLedPrg = new JTextField();
		frame.add(fieldLedPrg);
		fieldLedPrg.setVisible(true);
		fieldLedPrg.setBounds(0, 30, 100, 50);
		fieldLedPrg.setFont(new Font("SansSerif", Font.BOLD, 20));

		fieldLedMod = new JTextField();
		frame.add(fieldLedMod);
		fieldLedMod.setVisible(true);
		fieldLedMod.setBounds(0, 110, 100, 50);
		fieldLedMod.setFont(new Font("SansSerif", Font.BOLD, 20));

		// /////////////////////////////////////////////////////////
		plusMod = new JButton("������");
		plusMod.setFont(new Font("SansSerif", Font.BOLD, 10));
		plusMod.setBackground(Color.yellow);
		frame.add(plusMod);
		plusMod.setBounds(110, 30, 80, 50);
		plusMod.setMnemonic('P');
		plusMod.addActionListener(new PlusMod());

		// /////////////////////////////////////////////////////////
		minusMod = new JButton("������");
		minusMod.setFont(new Font("SansSerif", Font.BOLD, 10));
		minusMod.setBackground(Color.yellow);
		frame.add(minusMod);
		minusMod.setBounds(200, 30, 80, 50);
		minusMod.setMnemonic('P');
		minusMod.addActionListener(new PlusMod());

		// /////////////////////////////////////////////////////////
		plusPrg = new JButton("������");
		plusPrg.setFont(new Font("SansSerif", Font.BOLD, 10));
		plusPrg.setBackground(Color.yellow);
		frame.add(plusPrg);
		plusPrg.setBounds(110, 110, 80, 50);
		plusPrg.setMnemonic('P');
		plusPrg.addActionListener(new PlusMod());

		// /////////////////////////////////////////////////////////
		minusPrg = new JButton("������");
		minusPrg.setFont(new Font("SansSerif", Font.BOLD, 10));
		minusPrg.setBackground(Color.yellow);
		frame.add(minusPrg);
		minusPrg.setBounds(200, 110, 80, 50);
		minusPrg.setMnemonic('P');
		minusPrg.addActionListener(new PlusMod());

		JLabel labelMod = new JLabel("������ �������� �� ������� �����");
		JLabel labelPrg = new JLabel("������ �������� �� ��������");

		frame.add(labelMod);
		labelMod.setBounds(0, 0, 250, 30);

		frame.add(labelPrg);
		labelPrg.setBounds(0, 0, 250, 190);

		destination = new File("C://EFB_PROG//DESTINATION");
		sorse = new File("C://EFB_PROG//SORSE");

		sorseArr = sorse.listFiles();

		// System.out.println(destinationArr);

	}

	public static class PlusMod implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {

		}
	}
}

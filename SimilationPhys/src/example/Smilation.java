package example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.FlowLayout;

public class Smilation {

	private JFrame frame;
	private Double n = 1.2;
	private int TLineX1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Smilation window = new Smilation();
					window.frame.setVisible(true);
					window.frame.repaint();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Smilation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Prism panel = new Prism();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 166, 700, 500);
		panel.repaint();
		JSlider slider = new JSlider();
		slider.setValue(300);

		JLabel lblValueA = new JLabel("value");
		lblValueA.setHorizontalAlignment(SwingConstants.CENTER);
		lblValueA.setBounds(145, 33, 75, 30);
		frame.getContentPane().add(lblValueA);

		JLabel labelValueN = new JLabel("value");
		labelValueN.setHorizontalAlignment(SwingConstants.CENTER);
		labelValueN.setBounds(669, 33, 75, 30);
		frame.getContentPane().add(labelValueN);

		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblValueA.setText(slider.getValue() + "");
				panel.setX(slider.getValue());
				panel.repaint();
			}
		});
		slider.setBackground(Color.BLUE);
		slider.setMaximum(500);
		slider.setMinimum(300);
		slider.setBounds(49, 76, 278, 38);
		frame.getContentPane().add(slider);

		JSlider slider_1 = new JSlider();
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				n = (double) ((slider_1.getValue()) / 10.0);
				labelValueN.setText(n + "");
			}
		});
		slider_1.setValue(12);
		slider_1.setMinimum(12);
		slider_1.setMaximum(19);
		slider_1.setBackground(Color.BLUE);
		slider_1.setBounds(574, 76, 278, 38);
		frame.getContentPane().add(slider_1);

		

		frame.getContentPane().add(panel);
		frame.validate();
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBackground(Color.BLUE);
		lblA.setBounds(26, 33, 59, 29);
		frame.getContentPane().add(lblA);

		JLabel lblN = new JLabel("N");
		lblN.setHorizontalAlignment(SwingConstants.CENTER);
		lblN.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblN.setBackground(Color.BLUE);
		lblN.setBounds(575, 34, 59, 29);
		frame.getContentPane().add(lblN);
		frame.repaint();

	}
}

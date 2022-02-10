package com.ssafy.weather;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class WeatherMain {
	JFrame f = new JFrame("Weather Info");
	JButton b = new JButton("call Weather");
	JList li = new JList();
	WeatherDAO dao;

	public WeatherMain() {
		dao = new WeatherDAO();
		createGUI();
		addEvent();
	}

	private void addEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showList();
			}
		});
	}
	protected void showList() {
		java.util.List<Weather> datas = dao
				.getNewsList("http://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108");
		li.removeAll();
		li.setListData(datas.toArray());
	}
	private void createGUI() {
		f.add(b, "North");
		f.add(li);
		f.setSize(400, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new WeatherMain();
	}
}

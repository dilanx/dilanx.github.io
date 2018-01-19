package me.dilan.chatbox;

import java.awt.Container;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class SpreadTheWord {

	JFrame frame;
	
	String host = "drivehq.com";
	String pass = "37aaKXl4kJ0y";
	
	public SpreadTheWord() throws SocketException, IOException {
		FTPClient client = new FTPClient();
		client.connect(host, 21);
		client.login("DilanFTP", pass);
		client.enterLocalPassiveMode();
		client.setFileType(FTP.BINARY_FILE_TYPE);
		System.out.println("done");
		//readFiles();
		//loadWindow();
	}
	
	
	public static void main(String[] args) {
		try {
			new SpreadTheWord();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void readFiles() {
		
		File doc = new File(new JFileChooser().getFileSystemView().getDefaultDirectory(), "chathistory.dilan");
		if (!doc.exists()) {
			try {
				doc.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		List<String> list;
		try {
			list = Files.readAllLines(doc.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	private String chatString(List<String> list) {
		String s  = "";
		for(String x : list) {
			s += x + "\n";
		}
		return s;
	}
	
	private void loadWindow() {
		frame = new JFrame("Chat Box by Dilan");
		frame.setMinimumSize(new Dimension(1000, 700));
		frame.setSize(new Dimension(1000, 700));
		frame.setMaximumSize(new Dimension(1000, 700));
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		Container pane = new Container();
		
		JTextArea chat = new JTextArea();
		
		
		frame.setContentPane(pane);
		frame.setVisible(true);
	}
	
	
}

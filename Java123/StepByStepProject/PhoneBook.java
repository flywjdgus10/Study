package StepByStepProject;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

interface INIT_MENU {
	int INPUT = 1, EXIT=2;
}
interface INPUT_SELECT {
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}

@SuppressWarnings("serial")
class MenuChoiceException extends Exception {	
	int wrongChoice;
	public MenuChoiceException(int choice) {
		super("Wrong Choice");
		this.wrongChoice = choice;
	}
	public void showWrongChoice() {
		System.out.println(this.wrongChoice);
	}
}

@SuppressWarnings("serial")
class PhoneInfo implements Serializable {
	protected String name;
	protected String phoneNumber;
	public PhoneInfo(String name, String num) {
		this.name = name;
		this.phoneNumber = num;
	}
	public void showPhoneInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Phone : " + this.phoneNumber);
	}
	public String toString(){
		return "name : " + this.name + "\n" + "phone : " + this.phoneNumber + "\n";
	}
	
	public int hashCode(){
		return name.hashCode();
	}
	public boolean equals(Object obj){
		PhoneInfo cmp = (PhoneInfo)obj;
		if(this.name.compareTo(cmp.name) == 0)
			return true;
		else
			return false;
	}
}

@SuppressWarnings("serial")
class PhoneUnivInfo extends PhoneInfo {
	protected String major;
	protected int year;
	public PhoneUnivInfo(String name, String num, String major, int year) {
		super(name, num);
		this.major = major;
		this.year = year;
	}
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("Major : " + this.major);
		System.out.println("Year : " + this.year);
	}
	public String toString(){
		return super.toString() + "major : " + this.major + "\n" + "year : " + this.year + "\n";
	}
}

@SuppressWarnings("serial")
class PhoneCompanyInfo extends PhoneInfo {
	protected String company;
	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num);
		this.company = company;
	}
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("Company : " + this.company);
	}
	public String toString(){
		return super.toString() + "company : " + this.company + "\n";
	}
}

class PhoneBookManager {
	private final File dataFile = new File("PhoneBook.dat");
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();
	static PhoneBookManager inst = null;
	private PhoneBookManager() {
		readFromFile();
	}
	public static PhoneBookManager createManagerInst() {
		if (inst == null)
			inst = new PhoneBookManager();
		return inst;
	}
	
	private PhoneInfo readFriendInfo() {
		System.out.print("Name : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("Phone Number : ");
		String phoneNumber = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phoneNumber);
	}
	private PhoneInfo readUnivFriendInfo() {
		System.out.print("Name : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("Phone Number : ");
		String phoneNumber = MenuViewer.keyboard.nextLine();
		System.out.print("Major : ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.print("Year : ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}
	private PhoneInfo readCompanyFriendInfo() {
		System.out.print("Name : ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("Phone Number : ");
		String phoneNumber = MenuViewer.keyboard.nextLine();
		System.out.print("Company : ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phoneNumber, company);

	}

	public void inputData() throws MenuChoiceException {
		System.out.println("Start to input data.");
		System.out.println("1.Normal 2.University 3.Company");
		System.out.print("Choose : ");

		int choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null;

		if (choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);

		switch (choice) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo();
			break;
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo();
			break;
		}

		boolean isAdded = infoStorage.add(info);
		if(isAdded == true)
			System.out.println("Inputing data was successfully ended");
		else 
			System.out.println("The data is overlapped");
	}
	public String searchData(String name) {

		PhoneInfo info = search(name);
		if(info == null)
			return null;
		else
			return info.toString();
			
	}
	public boolean deleteData(String name) {
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while(itr.hasNext()){
			PhoneInfo curInfo = itr.next();
			if(curInfo.name.compareTo(name) == 0){
				itr.remove();
				return true;
			}				
		}
		return false;
	}

	private PhoneInfo search(String name) {
		Iterator<PhoneInfo> iter = infoStorage.iterator();
		while(iter.hasNext()){
			PhoneInfo curInfo = iter.next();
			if(name.compareTo(curInfo.name) == 0)
				return curInfo;
		}
		return null;
	}
	
	
	public void storeToFile(){
		try{
			FileOutputStream file = new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			Iterator<PhoneInfo> itr = infoStorage.iterator();
			while(itr.hasNext())
				out.writeObject(itr.next());
			
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void readFromFile(){
		if(dataFile.exists() == false)
			return;
		try{
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);
			
			while(true){
				PhoneInfo info = (PhoneInfo)in.readObject();
				if(info == null)
					break;
				infoStorage.add(info);
			}
			in.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		System.out.println();
		System.out.println("You can Choose");
		System.out.println("1.Insert data");
		System.out.println("2.Exit");
		System.out.print("Answer : ");
	}
}

class SearchEventHandler implements ActionListener{
	JTextField searchField;
	JTextArea textArea;
	
	SearchEventHandler(JTextField field,JTextArea area) {
		this.searchField = field;
		this.textArea = area;		
	}
	
	public void actionPerformed(ActionEvent e){
		String name = this.searchField.getText();
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		String srchResult = manager.searchData(name);
		if(srchResult == null)
			this.textArea.append("no data\n");
		else
			this.textArea.append("Here is the data\n");
			this.textArea.append(srchResult);
			this.textArea.append("\n");
	}
}

class DeleteEventHandler implements ActionListener{
	JTextField delField;
	JTextArea textArea;
	DeleteEventHandler(JTextField field,JTextArea area) {
		this.delField = field;
		this.textArea = area;
	}
	public void actionPerformed(ActionEvent e){
		String name = this.delField.getText();
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		boolean isDeleted = manager.deleteData(name);
		if(isDeleted)
			this.textArea.append("Success delete");
		else
			this.textArea.append("no data");
		
	}
}

@SuppressWarnings("serial")
class SearchDelFrame extends JFrame{
	JTextField srchField = new JTextField(15);
	JButton srchBtn = new JButton("Search");
	
	JTextField delField = new JTextField(15);
	JButton delBtn = new JButton("Delete");
	
	JTextArea textArea = new JTextArea(20,25);
	
	SearchDelFrame(String title) {
		
		super("PhoneBook");
		setBounds(100,200,330,450);
		setLayout(new BorderLayout());
		
		Border border = BorderFactory.createEtchedBorder();		
		
		Border srchBorder = BorderFactory.createTitledBorder(border,"Search");
		JPanel srchPanel = new JPanel();
		srchPanel.setBorder(srchBorder);
		srchPanel.setLayout(new FlowLayout());
		srchPanel.add(srchField);
		srchPanel.add(srchBtn);
		
		Border delBorder = BorderFactory.createTitledBorder(border,"Delete");
		JPanel delPanel = new JPanel();
		delPanel.setBorder(delBorder);
		delPanel.setLayout(new FlowLayout());
		delPanel.add(delField);
		delPanel.add(delBtn);
		
		JScrollPane scrollTextArea = new JScrollPane(textArea);
		Border textBorder = BorderFactory.createTitledBorder(border,"Infomation Board");
		scrollTextArea.setBorder(textBorder);
		
		add(srchPanel,BorderLayout.NORTH);
		add(delPanel,BorderLayout.SOUTH);
		add(scrollTextArea,BorderLayout.CENTER);
		
		srchBtn.addActionListener(new SearchEventHandler(srchField, textArea));
		delBtn.addActionListener(new DeleteEventHandler(delField, textArea));
		
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}

public class PhoneBook {

	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createManagerInst();
		@SuppressWarnings("unused")
		SearchDelFrame winFrame = new SearchDelFrame("PhoneBook");
		int choice;
		while(true){
			try{
				MenuViewer.showMenu();
				choice = MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				if(choice < INIT_MENU.INPUT || choice > INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);
				
				switch(choice){
				case INIT_MENU.INPUT:
					manager.inputData();
					break;
				case INIT_MENU.EXIT:
					manager.storeToFile();
					System.out.println("Quit program! Bye bye");
					System.exit(0);
					return;
				}
			}catch(MenuChoiceException e){
				e.showWrongChoice();
				System.out.println("---init---");
			}
		}		
	}
}

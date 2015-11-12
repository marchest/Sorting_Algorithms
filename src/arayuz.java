import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;





import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Random;

import javax.swing.JLabel;


public class arayuz {
	 HeapSort hp;
	 MergeSort myMergeSort;
	 QuickSort qs;
	long startTime, endTime;
	long startTime2, endTime2;
	long startTime3, endTime3;

	public static long getCPUTime() {
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		return bean.isCurrentThreadCpuTimeSupported() ?
		bean.getCurrentThreadCpuTime() : 0L;
		}
	
	private JFrame frame;
	private JTextField textField;
	private JButton button;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arayuz window = new arayuz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public arayuz() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame("Data Structures");
		frame.setBounds(100, 100, 764, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("MergeSort");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int length=Integer.parseInt((textField.getText()));
				Integer a[]=createReverseSortedArray(length);
			
				Integer b[]=createRandomArray(length);
				Integer c[]=createSortedArray(length);
				startTime = getCPUTime();
				
				myMergeSort.mergeSort(a);
				
				 endTime = getCPUTime();
				String s= Double.toString(((double)endTime-(double)startTime));
				s=s+" nanosc";
				 textField_3.setText(s);
				 Runtime runtime = Runtime.getRuntime();
				 runtime.gc();
				 
				 long mem=runtime.totalMemory()-runtime.freeMemory();
				System.out.println(PerformanceTest.bytesToMegaByte(mem)+" MB memory usage for MergeSort, input Size:"+length);
				System.out.println();
				 
				 startTime2 = getCPUTime();
					
					myMergeSort.mergeSort(c);
					
					 endTime2 = getCPUTime();
					String c1= Double.toString(((double)endTime2-(double)startTime2));
					c1=c1+" nanosc";
					 textField_4.setText(c1);
					
			
					 startTime3 = getCPUTime();
						
						myMergeSort.mergeSort(b);
						
						 endTime3 = getCPUTime();
						String d= Double.toString(((double)endTime3-(double)startTime3));
						d=d+" nanosc";
						 textField_5.setText(d);
					/*	 Runtime runtime3 = Runtime.getRuntime();
						 runtime3.gc();
						 
						 long mem3=runtime3.totalMemory()-runtime3.freeMemory();
						System.out.println(PerformanceTest.bytesToMegaByte(mem3)+" MB memory usage for MergeSort RandomSorted array");
				*/
			}
		});
		
		btnNewButton.setBounds(10, 62, 95, 27);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(131, 62, 114, 27);
		textField.setColumns(10);
		frame.getContentPane().add(textField);
		
		button = new JButton("QuickSort");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int length=Integer.parseInt((textField_2.getText()));
				int a[]=createReverseSortedArray1(length);
				int b[]=createRandomArray1(length);
				int c[]=createSortedArray1(length);
				 Runtime runtime = Runtime.getRuntime();
				 runtime.gc();
				startTime = getCPUTime();
				
				qs.quickSort(a,0,length-1);
				
				 endTime = getCPUTime();
				String s= Double.toString(((double)endTime-(double)startTime));
				s=s+" nanosc";
				 textField_9.setText(s);
				 
				
				 
				 long mem=runtime.totalMemory()-runtime.freeMemory();
				System.out.println(PerformanceTest.bytesToMegaByte(mem)+" MB memory usage for QuickSort,inputSize: "+length);
				System.out.println();
				 
					startTime2 = getCPUTime();
					
					qs.quickSort(c,0,length-1);
					
					 endTime2 = getCPUTime();
					String g= Double.toString(((double)endTime2-(double)startTime2));
					g=g+" nanosc";
					 textField_10.setText(g);
					 
					 
						startTime3 = getCPUTime();
						
						qs.quickSort(b,0,length-1);
						
						 endTime3 = getCPUTime();
						String d= Double.toString(((double)endTime3-(double)startTime3));
						d=d+" nanosc";
						 textField_11.setText(d);
				
				
				
			}
		});
		button.setBounds(10, 227, 95, 27);
		frame.getContentPane().add(button);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 139, 114, 27);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(131, 227, 114, 27);
		frame.getContentPane().add(textField_2);
		
		button_1 = new JButton("HeapSort");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length=Integer.parseInt((textField_1.getText()));
				int a[]=createReverseSortedArray1(length);
				int c[]=createSortedArray1(length);
				int b[]=createRandomArray1(length);
				
				startTime = getCPUTime();
				
				hp.sort(a);
				 endTime = getCPUTime();
				String s= Double.toString(((double)endTime-(double)startTime));
				s=s+" nanosc";
				 textField_6.setText(s);
				
				 Runtime runtime = Runtime.getRuntime();
				 runtime.gc();
				 
				 long mem=runtime.totalMemory()-runtime.freeMemory();
				System.out.println(PerformanceTest.bytesToMegaByte(mem)+" MB memory usage for HeapSort, inputSize: "+length);
				System.out.println();
				 
				 
				 startTime2 = getCPUTime();
					
					hp.sort(c);
					 endTime2 = getCPUTime();
					String d= Double.toString(((double)endTime2-(double)startTime2));
					d=d+" nanosc";
					 textField_7.setText(d);
					 
					 
					 
					 startTime3 = getCPUTime();
						
						hp.sort(b);
						 endTime3 = getCPUTime();
						String g= Double.toString(((double)endTime3-(double)startTime3));
						g=g+" nanosc";
						 textField_8.setText(g);
				
			}
		});
		button_1.setBounds(10, 139, 95, 27);
		frame.getContentPane().add(button_1);
		
		JLabel lblEnterTheSize = new JLabel("Enter the size");
		lblEnterTheSize.setBounds(145, 37, 80, 14);
		frame.getContentPane().add(lblEnterTheSize);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(276, 62, 114, 27);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(409, 62, 114, 27);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(568, 62, 114, 27);
		frame.getContentPane().add(textField_5);
		
		JLabel lblReversed = new JLabel("Reversed");
		lblReversed.setBounds(310, 37, 80, 14);
		frame.getContentPane().add(lblReversed);
		
		JLabel lblSorted = new JLabel("Sorted");
		lblSorted.setBounds(443, 37, 80, 14);
		frame.getContentPane().add(lblSorted);
		
		JLabel lblRando = new JLabel("Random");
		lblRando.setBounds(602, 37, 80, 14);
		frame.getContentPane().add(lblRando);
		
		textField_6 = new JTextField();
		textField_6.setBounds(276, 142, 114, 24);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(409, 142, 114, 24);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(568, 142, 114, 24);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(276, 230, 114, 24);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(409, 230, 114, 24);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(568, 230, 114, 24);
		frame.getContentPane().add(textField_11);
		
	}
	
	static Integer[] createRandomArray(int length){
		Integer[] arr=new Integer[length];
		Random rand=new Random();
		for (int i=0;i<length;i++){
			arr[i]=rand.nextInt(10000);
		}
		return arr;
	}

	static Integer[] createSortedArray(int length){
		
		Integer []arr=new Integer[length];
		for (int i = 0; i < length; i++) {
			arr[i]=i;
		}
		return arr;
	}
	
	static Integer[] createReverseSortedArray(int length){
		Integer []arr=new Integer[length];
		for (int i = 0; i <length; i++) {
			arr[i]=length-i;
		}
		return arr;
	}
	
	
	static int[] createRandomArray1(int length){
		int[] arr=new int[length];
		Random rand=new Random();
		for (int i=0;i<length;i++){
			arr[i]=rand.nextInt(10000);
		}
		return arr;
	}

	static int[] createSortedArray1(int length){
		
		int []arr=new int[length];
		for (int i = 0; i < length; i++) {
			arr[i]=i;
		}
		return arr;
	}
	
	static int[] createReverseSortedArray1(int length){
		int []arr=new int[length];
		for (int i = 0; i <length; i++) {
			arr[i]=length-i;
		}
		return arr;
	}
}

package business;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.TransferHandler;
import javax.swing.border.LineBorder;

import library.ImageSelection;
import library.Scalr;

public class Item extends JPanel
{
	private BufferedImage img;
	private ImageIcon icon;
	private JLabel slot;
	private JLabel imgLabel;
	private JFormattedTextField description;

	private String slotStr;
	private String descStr;
	private String path;
	
	private boolean imgChange = true;
	private boolean newPic = false;

	public Item()
	{
		super();	
		setSize(210, 314);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		slot = new JLabel();
		slot.setBackground(Color.WHITE);
		slot.setText("test");
		slot.setFont(new Font("Verdana", Font.PLAIN, 11));
		slot.setBounds(2, 2, 206, 20);
		slot.setHorizontalTextPosition(SwingConstants.CENTER);
		slot.setHorizontalAlignment(SwingConstants.CENTER);
		add(slot);
		
		icon = new ImageIcon();
		img = null;
		try 
		{
		    img = ImageIO.read(new File("images/sheets/blank.png"));
		    img = Scalr.resize(img, 206, 266);
		    icon.setImage(img);
		} catch (IOException e) {
			
		}
							
		imgLabel = new JLabel();	
		imgLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imgLabel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		imgLabel.setBackground(Color.WHITE);
		imgLabel.setIcon(icon);
		imgLabel.setBounds(2, 24, 206, 266);
		add(imgLabel);

		imgLabel.setTransferHandler(new ImageSelection());	    

		MouseListener listener = new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				JComponent comp = (JComponent) me.getSource();
				TransferHandler handler = comp.getTransferHandler();
				handler.exportAsDrag(comp, me, TransferHandler.COPY);     
			}
		};

		imgLabel.addMouseListener(listener);

		imgLabel.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				if(imgChange)
				{
					icon = (ImageIcon)imgLabel.getIcon();
					img = Scalr.resize((BufferedImage)icon.getImage(), 206, 266);
					icon.setImage(img);
					newPic = true;
				}
			}
		});	
		
		description = new JFormattedTextField();
		description.setBounds(2, 292, 206, 20);
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setText("(description)");
		add(description);
		description.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyReleased(KeyEvent e) 
			{
				setDescStr(description.getText());
			}
		});
	}
	
	public Item(String slotStr)
	{
		super();
		setSize(210, 314);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		slot = new JLabel(slotStr);
		slot.setBackground(Color.WHITE);
		slot.setFont(new Font("Verdana", Font.PLAIN, 11));
		slot.setBounds(2, 2, 206, 20);
		slot.setHorizontalAlignment(SwingConstants.CENTER);
		add(slot);
		
		icon = new ImageIcon();
		img = null;
		try 
		{
		    img = ImageIO.read(new File("images/sheets/blank.png"));
		    img = Scalr.resize(img, 206, 266);
		    icon.setImage(img);
		} catch (IOException e) {
			
		}
		
		imgLabel = new JLabel();	
		imgLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imgLabel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		imgLabel.setBackground(Color.WHITE);
		imgLabel.setIcon(icon);
		imgLabel.setBounds(2, 24, 206, 266);
		add(imgLabel);

		imgLabel.setTransferHandler(new ImageSelection());	    

		MouseListener listener = new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				JComponent comp = (JComponent) me.getSource();
				TransferHandler handler = comp.getTransferHandler();
				handler.exportAsDrag(comp, me, TransferHandler.COPY);     
			}
		};

		imgLabel.addMouseListener(listener);

		imgLabel.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				if(imgChange)
				{
					icon = (ImageIcon)imgLabel.getIcon();
					img = Scalr.resize((BufferedImage)icon.getImage(), 206, 266);
					icon.setImage(img);
					newPic = true;
				}
			}
		});	
		
		description = new JFormattedTextField();
		description.setBounds(2, 290, 206, 20);
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setText("(description)");
		add(description);
		description.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyReleased(KeyEvent e) 
			{
				setDescStr(description.getText());
			}
		});
	}
	
	public Item(String slotStr, String path)
	{
		super();
		this.path = path;
		setSize(210, 314);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		slot = new JLabel(slotStr);
		slot.setBackground(Color.WHITE);
		slot.setFont(new Font("Verdana", Font.PLAIN, 11));
		slot.setBounds(2, 2, 206, 20);
		slot.setHorizontalAlignment(SwingConstants.CENTER);
		add(slot);
		
		icon = new ImageIcon();
		img = null;
		try 
		{
		    img = ImageIO.read(new File("images/items/"+path));
		    img = Scalr.resize(img, 206, 266);
		    icon.setImage(img);
		} catch (IOException e) {
			
		}
		
		imgLabel = new JLabel();	
		imgLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imgLabel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		imgLabel.setBackground(Color.WHITE);
		imgLabel.setIcon(icon);
		imgLabel.setBounds(2, 24, 206, 266);
		add(imgLabel);

		imgLabel.setTransferHandler(new ImageSelection());	    

		MouseListener listener = new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				JComponent comp = (JComponent) me.getSource();
				TransferHandler handler = comp.getTransferHandler();
				handler.exportAsDrag(comp, me, TransferHandler.COPY);     
			}
		};

		imgLabel.addMouseListener(listener);

		imgLabel.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				if(imgChange)
				{
					icon = (ImageIcon)imgLabel.getIcon();
					img = Scalr.resize((BufferedImage)icon.getImage(), 206, 266);
					icon.setImage(img);
					newPic = true;
				}
			}
		});	
		
		description = new JFormattedTextField();
		description.setBounds(2, 290, 206, 20);
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setText("(description)");
		add(description);
		description.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyReleased(KeyEvent e) 
			{
				setDescStr(description.getText());
			}
		});
	}
	
	public Item(String slotStr, String path, String descStr)
	{
		super();
		this.path = path;
		this.descStr = descStr;
		setSize(210, 314);
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		slot = new JLabel(slotStr);
		slot.setBackground(Color.WHITE);
		slot.setFont(new Font("Verdana", Font.PLAIN, 11));
		slot.setBounds(2, 2, 206, 20);
		slot.setHorizontalAlignment(SwingConstants.CENTER);
		add(slot);
		
		icon = new ImageIcon();
		img = null;
		try 
		{
		    img = ImageIO.read(new File("images/items/"+path));
		    img = Scalr.resize(img, 206, 266);
		    icon.setImage(img);
		} catch (IOException e) {
			
		}
		
		imgLabel = new JLabel();	
		imgLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		imgLabel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		imgLabel.setBackground(Color.WHITE);
		imgLabel.setIcon(icon);
		imgLabel.setBounds(2, 24, 206, 266);
		add(imgLabel);

		imgLabel.setTransferHandler(new ImageSelection());	    

		MouseListener listener = new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				JComponent comp = (JComponent) me.getSource();
				TransferHandler handler = comp.getTransferHandler();
				handler.exportAsDrag(comp, me, TransferHandler.COPY);     
			}
		};

		imgLabel.addMouseListener(listener);

		imgLabel.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				if(imgChange)
				{
					icon = (ImageIcon)imgLabel.getIcon();
					img = Scalr.resize((BufferedImage)icon.getImage(), 206, 266);
					icon.setImage(img);
					newPic = true;
				}
			}
		});	
		
		description = new JFormattedTextField();
		description.setBounds(2, 290, 206, 20);
		description.setHorizontalAlignment(SwingConstants.CENTER);
		description.setText(descStr);
		add(description);
		description.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyReleased(KeyEvent e) 
			{
				setDescStr(description.getText());
			}
		});
	}
	
	
	
	
	
	public void setDescStr(String descStr)
	{
		this.descStr = descStr;
	}
}

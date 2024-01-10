package main;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lib.MafLib;

public class Main{
    static Boolean canPutOper = false;
    public static int parseEq(String[] s){
        if(s[1].equals("+")){
            return Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
        }
        else if(s[1].equals("-")){
            return Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
        }
        else if(s[1].equals("×")){
            return Integer.parseInt(s[0]) * Integer.parseInt(s[2]);
        }
        else{
            return Integer.parseInt(s[0]) / Integer.parseInt(s[2]);
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jalculator M");
        frame.setSize(275, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
        
        JButton settings = new JButton();
        frame.add(settings);
        settings.setBounds(10, 10, 45, 45);
        settings.setIcon(new ImageIcon("resources/16x16gear.png"));
        
        JLabel output = new JLabel();        
        frame.add(output);
        output.setBounds(60, 10, 200, 45);
        output.setFont(new Font("Arial", 0, 25));
        
        frame.addKeyListener(new KeyListener() {
            @Override public void keyTyped(KeyEvent e){}
            @Override public void keyReleased(KeyEvent e){}

            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() >= 48 && e.getKeyCode() <= 57){
                    output.setText(output.getText() + e.getKeyChar());
                }
                if(e.getKeyCode() == 8){
                    output.setText(output.getText().substring(0, output.getText().length()-1));
                }
                System.out.println(e.getKeyCode());
            }
        });

        JButton Zero = new JButton("0");
        frame.add(Zero);
        Zero.setBounds(5, 310, 45, 45);
        Zero.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 0);
                canPutOper = true;
            }
        });

        JButton One = new JButton("1");
        frame.add(One);
        One.setBounds(5, 260, 45, 45);
        One.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 1);
                canPutOper = true;
            }
        });

        JButton Two = new JButton("2");
        frame.add(Two);
        Two.setBounds(55, 260, 45, 45);
        Two.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 2);
                canPutOper = true;
            }
        });
        
        JButton Three = new JButton("3");
        frame.add(Three);
        Three.setBounds(105, 260, 45, 45);
        Three.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 3);
                canPutOper = true;
            }
        });

        JButton Four = new JButton("4");
        frame.add(Four);
        Four.setBounds(5, 210, 45, 45);
        Four.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 4);
                canPutOper = true;
            }
        });

        JButton Five = new JButton("5");
        frame.add(Five);
        Five.setBounds(55, 210, 45, 45);
        Five.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 5);
                canPutOper = true;
            }
        });

        JButton Six = new JButton("6");
        frame.add(Six);
        Six.setBounds(105, 210, 45, 45);
        Six.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 6);
                canPutOper = true;
            }
        });

        JButton Seven = new JButton("7");
        frame.add(Seven);
        Seven.setBounds(5, 160, 45, 45);
        Seven.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 7);
                canPutOper = true;
            }
        });

        JButton Eight = new JButton("8");
        frame.add(Eight);
        Eight.setBounds(55, 160, 45, 45);
        Eight.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 8);
                canPutOper = true;
            }
        });

        JButton Nine = new JButton("9");
        frame.add(Nine);
        Nine.setBounds(105, 160, 45, 45);
        Nine.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                output.setText(output.getText() + 9);
                canPutOper = true;
            }
        });

        JButton Add = new JButton("+");
        frame.add(Add);
        Add.setBounds(155, 260, 45, 45);
        Add.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                if(canPutOper == true){
                    output.setText(output.getText() + "+");
                    canPutOper = false;
                }
            }
        });

        JButton Subtract = new JButton("-");
        frame.add(Subtract);
        Subtract.setBounds(205, 260, 45, 45);
        Subtract.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                if(canPutOper == true){
                    output.setText(output.getText() + "-");
                    canPutOper = false;
                }
            }
        });

        JButton Multiply = new JButton("×");
        frame.add(Multiply);
        Multiply.setBounds(155, 310, 45, 45);
        Multiply.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                if(canPutOper == true){
                    output.setText(output.getText() + "×");
                    canPutOper = false;
                }
            }
        });

        JButton Divide = new JButton("÷");
        frame.add(Divide);
        Divide.setBounds(205, 310, 45, 45);
        Divide.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                if(canPutOper == true){
                    output.setText(output.getText() + "÷");
                    canPutOper = false;
                }
            }
        });

        JButton Equal = new JButton("=");
        frame.add(Equal);
        Equal.setBounds(105, 310, 45, 45);
        Equal.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                String s = output.getText();
                int ans = 0;
                ArrayList<String> numbers = new ArrayList<>(0);
                String n = "";
                for(int i = 0; i < s.length(); i++){
                    String a = ""; a += s.charAt(i);    
                    if(MafLib.ArrayInd(new String[]{"+", "-", "×", "÷"}, a) == -1){
                        n = n + a;
                        if(i == s.length()-1){
                            numbers.add(n);
                        }
                    }
                    else{
                        numbers.add(n + a);
                        n = "";
                    }
                }
                System.out.println(numbers);
        }});

        JButton Decimal = new JButton(".");
        frame.add(Decimal);
        Decimal.setBounds(55, 310, 45, 45);
        Decimal.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
                if(canPutOper == true){
                    output.setText(output.getText() + ".");
                    canPutOper = false;
                }
            }
        });

        JButton CE = new JButton("CE");
        frame.add(CE);
        CE.setBounds(155, 210, 95, 45);
        CE.setFont(new Font("Arial", 0, 15));
        CE.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e){
            output.setText(output.getText().substring(0, output.getText().length()-1));
        }});
    }
}
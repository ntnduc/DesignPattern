using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab06_RemoteControl
{
    public partial class RemoteControl : Form
    {
        private ICommand Slot1ON;
        private ICommand Slot1OFF;

        private Light light;
        private ICommand LightON;
        private ICommand LightOFF;

        public RemoteControl()
        {
            InitializeComponent();

            light = new Light(this.txtStatus1);

            LightON = new LightOn(light);
            LightOFF = new LightOff(light);
        }

        private void btnOn1_Click(object sender, EventArgs e)
        {
            Slot1ON.Execute();        
        }

        private void btnOFF1_Click(object sender, EventArgs e)
        {
            Slot1OFF.Execute();
        }

        private void cboSlot1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (cboSlot1.SelectedItem.ToString().Equals("Light")){
                Slot1OFF = LightOFF;
                Slot1ON = LightON;
            }
        }
    }
}

using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab06_RemoteControl
{
    class Light
    {
        private TextBox status;

        public Light(TextBox status)
        {
            this.status = status;

            this.status.BackColor = Color.Gray;
        }

        public void turnOn()
        {
            this.status.BackColor = Color.Green;
        }

        public void turnOff()
        {
            this.status.BackColor = Color.Gray;
        }
    }

    class LightOn : ICommand
    {
        private Light light;

        public LightOn(Light light)
        {
            this.light = light;
        }
        public void Execute()
        {
            this.light.turnOn();
        }
    }

    class LightOff : ICommand
    {
        private Light light;

        public LightOff(Light light)
        {
            this.light = light;
        }

        public void Execute()
        {
            this.light.turnOff();
        }
    }
}

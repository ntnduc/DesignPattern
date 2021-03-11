
namespace Lab06_RemoteControl
{
    partial class RemoteControl
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.cboSlot1 = new System.Windows.Forms.ComboBox();
            this.txtStatus1 = new System.Windows.Forms.TextBox();
            this.btnOn1 = new System.Windows.Forms.Button();
            this.btnOFF1 = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.cboSlot2 = new System.Windows.Forms.ComboBox();
            this.txtStatus2 = new System.Windows.Forms.TextBox();
            this.btnON2 = new System.Windows.Forms.Button();
            this.btnOFF2 = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 15);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(40, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Slot 01";
            // 
            // cboSlot1
            // 
            this.cboSlot1.FormattingEnabled = true;
            this.cboSlot1.Items.AddRange(new object[] {
            "Light",
            "TV",
            "Door"});
            this.cboSlot1.Location = new System.Drawing.Point(61, 12);
            this.cboSlot1.Name = "cboSlot1";
            this.cboSlot1.Size = new System.Drawing.Size(87, 21);
            this.cboSlot1.TabIndex = 1;
            this.cboSlot1.SelectedIndexChanged += new System.EventHandler(this.cboSlot1_SelectedIndexChanged);
            // 
            // txtStatus1
            // 
            this.txtStatus1.Location = new System.Drawing.Point(154, 12);
            this.txtStatus1.Name = "txtStatus1";
            this.txtStatus1.Size = new System.Drawing.Size(57, 20);
            this.txtStatus1.TabIndex = 2;
            // 
            // btnOn1
            // 
            this.btnOn1.Location = new System.Drawing.Point(217, 10);
            this.btnOn1.Name = "btnOn1";
            this.btnOn1.Size = new System.Drawing.Size(32, 23);
            this.btnOn1.TabIndex = 3;
            this.btnOn1.Text = "ON";
            this.btnOn1.UseVisualStyleBackColor = true;
            this.btnOn1.Click += new System.EventHandler(this.btnOn1_Click);
            // 
            // btnOFF1
            // 
            this.btnOFF1.Location = new System.Drawing.Point(255, 10);
            this.btnOFF1.Name = "btnOFF1";
            this.btnOFF1.Size = new System.Drawing.Size(37, 23);
            this.btnOFF1.TabIndex = 4;
            this.btnOFF1.Text = "OFF";
            this.btnOFF1.UseVisualStyleBackColor = true;
            this.btnOFF1.Click += new System.EventHandler(this.btnOFF1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 52);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(40, 13);
            this.label2.TabIndex = 0;
            this.label2.Text = "Slot 02";
            // 
            // cboSlot2
            // 
            this.cboSlot2.FormattingEnabled = true;
            this.cboSlot2.Items.AddRange(new object[] {
            "Light",
            "TV",
            "Door"});
            this.cboSlot2.Location = new System.Drawing.Point(61, 49);
            this.cboSlot2.Name = "cboSlot2";
            this.cboSlot2.Size = new System.Drawing.Size(87, 21);
            this.cboSlot2.TabIndex = 1;
            // 
            // txtStatus2
            // 
            this.txtStatus2.Location = new System.Drawing.Point(154, 49);
            this.txtStatus2.Name = "txtStatus2";
            this.txtStatus2.Size = new System.Drawing.Size(57, 20);
            this.txtStatus2.TabIndex = 2;
            // 
            // btnON2
            // 
            this.btnON2.Location = new System.Drawing.Point(217, 47);
            this.btnON2.Name = "btnON2";
            this.btnON2.Size = new System.Drawing.Size(32, 23);
            this.btnON2.TabIndex = 3;
            this.btnON2.Text = "ON";
            this.btnON2.UseVisualStyleBackColor = true;
            // 
            // btnOFF2
            // 
            this.btnOFF2.Location = new System.Drawing.Point(255, 47);
            this.btnOFF2.Name = "btnOFF2";
            this.btnOFF2.Size = new System.Drawing.Size(37, 23);
            this.btnOFF2.TabIndex = 4;
            this.btnOFF2.Text = "OFF";
            this.btnOFF2.UseVisualStyleBackColor = true;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(13, 387);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(39, 13);
            this.label3.TabIndex = 5;
            this.label3.Text = "LIGHT";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(12, 419);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(21, 13);
            this.label4.TabIndex = 6;
            this.label4.Text = "TV";
            // 
            // RemoteControl
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(309, 514);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.btnOFF2);
            this.Controls.Add(this.btnOFF1);
            this.Controls.Add(this.btnON2);
            this.Controls.Add(this.btnOn1);
            this.Controls.Add(this.txtStatus2);
            this.Controls.Add(this.txtStatus1);
            this.Controls.Add(this.cboSlot2);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.cboSlot1);
            this.Controls.Add(this.label1);
            this.Name = "RemoteControl";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Remote Control";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox cboSlot1;
        private System.Windows.Forms.TextBox txtStatus1;
        private System.Windows.Forms.Button btnOn1;
        private System.Windows.Forms.Button btnOFF1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox cboSlot2;
        private System.Windows.Forms.TextBox txtStatus2;
        private System.Windows.Forms.Button btnON2;
        private System.Windows.Forms.Button btnOFF2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
    }
}


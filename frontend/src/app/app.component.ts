import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { Chart, registerables } from 'chart.js';
Chart.register(...registerables)

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  title = 'frontend';

  public config: any = {
    type: 'bar',

    data:{
      labels: ['JAN', 'FEB', 'MAR'],
      datasets: [
        {
          label: 'Sales',
          data: ['467', '576'],
          backgroundColor: 'blue',
          },
        {
          label: 'PAT',
          data: ['100', '120'],
          backgroundColor: 'red',
          },
        ],
      },
    options: {
        aspectRatio: 1,
        },
      };
    chart: any;
    ngOnInit(): void {
      this.chart = new Chart('MyChart', this.config);
      }
}

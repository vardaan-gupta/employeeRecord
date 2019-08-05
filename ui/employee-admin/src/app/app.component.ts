import { Component, ViewChild } from '@angular/core';
import { HttpUrlService } from './services/http-url.service';
import { observable } from 'rxjs';
import { Employee } from './models/employee';
import { MatPaginator, MatTableDataSource, MatSort } from '@angular/material';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.css']
})
export class AppComponent {
	title = 'employee-admin';
	response: any;
	employees: Employee[];


	displayedColumns: string[] = ['Id','name'];
  	dataSource : MatTableDataSource<Employee>;	  
	@ViewChild('paginator', {static: false,}) paginator: MatPaginator;
	@ViewChild('sort', {static:false}) sort: MatSort;

	constructor(private httpUrlService: HttpUrlService) {
		this.httpUrlService = httpUrlService;
		//this.employees = this.response;
	}

	

	ngOnInit() {
		this.httpUrlService.getEmployeeList().subscribe(res => {
			console.log(res);
			
				this.response = res;
				this.employees = this.response;
			
				this.dataSource = new MatTableDataSource(this.employees);
				this.dataSource.paginator = this.paginator;
				this.dataSource.sort = this.sort;
				console.log('datasource', this.dataSource);
				
		
		});
		
		console.log('emp', this.employees);
	}
}

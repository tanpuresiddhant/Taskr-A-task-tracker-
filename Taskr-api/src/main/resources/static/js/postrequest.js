$( document ).ready(function() {
	
	var listTasks = [];

	/**
	 * Using JQuery for hiding some elements in view when bootstrap app
	 */
	// Hide task table when starting
	// we just show it if having any task is added
	$('#taskTable').hide();
	$('#postTaskBtn').hide();
	
	// Customer-Form submit
    $("#taskForm").submit(function(event) {
		// Prevent the form from submitting via the browser.
		event.preventDefault();
		
		// get data from submit form
		
		var formTask = {
    			taskName : $("#taskName").val(),
    			taskDescription : $("#taskdescription").val(),
    			taskNotes : $("#tasknotes").val(),
                taskPriority : $("#taskpriority").val(),
    	}
		
		// store customer
		listTasks.push(formTask);
		
		// re-render customer table by append new customer to table
		
		var taskRow = '<tr>' +
							'<td>' + listTasks.length + '</td>' +
							'<td>' + formTask.taskName.toUpperCase() + '</td>' +
							'<td>' + formTask.taskDescription + '</td>' +
							'<td>' + formTask.taskNotes + '</td>' +
							'<td>' + formTask.taskPriority + '</td>' +
					        '<td class="text-center">' +
					        	'<input type="hidden" value=' + (listTasks.length - 1) + '>' +
					        	'<a>' +
					  				'<span class="glyphicon glyphicon-remove"></span>' +
								'</a>' +
					        '</td>' +
						  '</tr>';

		$('#taskTable tbody').append(taskRow);

		// just how customer table and POST button
		$('#taskTable').show();
		$('#postTaskBtn').show();
		
		// Reset FormData after Posting
    	resetData();
	});
    
	// Do DELETE a Customer via JQUERY AJAX
	$(document).on("click","a",function() {
		var customerId = $(this).parent().find('input').val();
		$(this).closest("tr").remove()
	});
	
	// Submit List of Customer to Back-End server
	$('#postTaskBtn').click(function(){
		ajaxPost();
	});
	
    function ajaxPost(){
    	
    	// DO POST
    	$.ajax({
			type : "POST",
			contentType : "application/json",
			accept: 'text/plain',
			url : window.location + "/api/tasks/save",
			data : JSON.stringify(listTasks),
			dataType: 'text',
			success : function(result) {
				// clear customer body
				$('#taskTable tbody').empty();
				$('#taskTable').hide();
				
				// re-set customer table list
				listTasks = [];
				
				// fill successfully message on view
				$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
											result +
										  "</p>");
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    }
    
    function resetData(){
    	$("#taskname").val("");
    	$("#taskdescription").val("");
    	$("#tasknotes").val("");
    	$("#taskpriority").val("");
    }
})
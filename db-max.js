var today = new Date();
var todayDateString = today.getFullYear() + "-" + ("0" + (today.getMonth() + 1)).slice(-2)  + "-" + ("0" + today.getDate()).slice(-2);
$("#identitetStyrkt").val("Anhörig").change();
$("#land").val("Mordor").change();
$("#dodsdatumSakertNo").prop("checked", true).trigger("click");
$("#datepicker_antraffatDodDatum").val(todayDateString).change();
$("#dodsplatsKommun").val("Vattnadal").change();
$("#dodsdatum-year-selected-item-label").val(today.getFullYear()).change()
$("#dodsdatum-month-selected-item-label").val(today.getMonth()).change()
$("#dodsplatsBoende-ORDINART_BOENDE").prop("checked", true).trigger("click");
$("#barnNo").prop("checked", true).trigger("click");
$("#explosivImplantatYes").prop("checked", true).trigger("click");
$("#explosivAvlagsnatYes").prop("checked", true).trigger("click");
$("#undersokningYttre-JA").prop("checked", true).trigger("click");
$("#polisanmalanYes").prop("checked", true).trigger("click");
import httpClient from "../http-common";

// Obtener todas las reservas
const getAll = () => {
  return httpClient.get("/reservations/all");
};

// Obtener una reserva por ID
const getById = (id) => {
  return httpClient.get(`/reservations/${id}`);
};


// Crear una reserva con cálculo de precios
const createWithPricing = (reservationData) => {
  return httpClient.post("/reservations/create", reservationData);
};

// Obtener reserva con cálculo de precios
const getReservationWithPricing = (id) => {
  return httpClient.get(`/reservations/${id}/pricing`);
};

// Obtener clientes de una reserva
const getCustomersByReservationId = (id) => {
  return httpClient.get(`/reservations/customers/${id}`);
};

// Enviar correo de confirmación
const sendConfirmationEmail = (id) => {
  return httpClient.post(`/reservations/sendMail/${id}`);
};
// Obtener reporte de vueltas/tiempo para un rango de fechas
const getLapsTimeReport = (startDate, endDate) => {
  return httpClient.get("/reservations/reports/laps-time", {
    params: {
      startDate: startDate,
      endDate: endDate
    }
  });
};

// Obtener reporte por tamaño de grupo para un rango de fechas
const getGroupSizeReport = (startDate, endDate) => {
  return httpClient.get("/reservations/reports/group-size", {
    params: {
      startDate: startDate,
      endDate: endDate
    }
  });
};

export default { 
  getAll, 
  getById, 
  createWithPricing, 
  getReservationWithPricing, 
  getCustomersByReservationId, 
  sendConfirmationEmail,
  getLapsTimeReport,
  getGroupSizeReport
};
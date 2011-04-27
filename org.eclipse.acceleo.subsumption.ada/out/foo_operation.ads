with foo_buffers; use foo_buffers;

package foo_operation is
   -- This operation is executed periodically
   function operation (inputs : in inputs_t) return outputs_t;
end foo_operation;

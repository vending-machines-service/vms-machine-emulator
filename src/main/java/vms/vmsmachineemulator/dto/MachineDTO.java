package vms.vmsmachineemulator.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "current_state_machines")
public class MachineDTO {
  @Id
  public int machineId;
  public List<SensorDTO> sensors;

  public MachineDTO(int machineId, List<SensorDTO> sensors) {
    super();
    this.machineId = machineId;
    this.sensors = sensors;
  }
}
